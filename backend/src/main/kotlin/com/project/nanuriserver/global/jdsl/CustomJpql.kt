package com.project.nanuriserver.global.jdsl

import com.linecorp.kotlinjdsl.dsl.jpql.Jpql
import com.linecorp.kotlinjdsl.dsl.jpql.JpqlDsl
import com.linecorp.kotlinjdsl.dsl.jpql.select.SelectQueryWhereStep
import com.linecorp.kotlinjdsl.querymodel.jpql.expression.Expressionable
import com.linecorp.kotlinjdsl.querymodel.jpql.expression.Expressions
import com.linecorp.kotlinjdsl.querymodel.jpql.predicate.Predicate
import com.linecorp.kotlinjdsl.querymodel.jpql.predicate.Predicates
import kotlin.reflect.KClass

class CustomJpql : Jpql() {
    private val falsePredicate get() = booleanLiteral(false).eq(booleanLiteral(true))
    val truePredicate get() = booleanLiteral(true).eq(booleanLiteral(true))

    companion object Constructor : JpqlDsl.Constructor<CustomJpql> {
        override fun newInstance(): CustomJpql = CustomJpql()
    }

    fun <T : Any, S : T?> Expressionable<T>.`in`(compareValues: Collection<S>): Predicate {
        if (compareValues.isEmpty())
            return falsePredicate

        return Predicates.`in`(this.toExpression(), compareValues.map { Expressions.value(it) })
    }

    inline fun <reified T : Any> selectFrom(type: KClass<T>): SelectQueryWhereStep<T> {
        val entity = entity(type)
        return select(entity).from(entity)
    }
}

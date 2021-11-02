package com.example.assignment2

import junit.framework.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun `generateUnderscores to return correct amount of underscores`() {
        // Given
        val word1 = "England"
        val word2 = "Spain"
        val word3 = "Italy"
        val word4 = "Saudi/Arabia"

        val underscores1 = "_______"
        val underscores2 = "_____"
        val underscores3 = "_____"
        val underscores4 = "_____/______"

        val gameManager = GameManager()

        // When
        val actual1 = gameManager.generateUnderscores(word1)
        val actual2 = gameManager.generateUnderscores(word2)
        val actual3 = gameManager.generateUnderscores(word3)
        val actual4 = gameManager.generateUnderscores(word4)

        // Then
        Assert.assertEquals(underscores1, actual1)
        Assert.assertEquals(underscores2, actual2)
        Assert.assertEquals(underscores3, actual3)
        Assert.assertEquals(underscores4, actual4)
    }
}
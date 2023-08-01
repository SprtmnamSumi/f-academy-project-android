package app.futured.academyproject

import app.futured.academyproject.data.NetworkClient
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class Task2Test {

    private lateinit var networkClient: NetworkClient

    @Before
    fun setup() {
        networkClient = NetworkClient()
    }

    @Test
    fun sendReturnsZero() = runTest {
        // TODO spustit networkClient.send() a zkontrolovat vysledek
        val value: Int = networkClient.send()
        assert(value == 0)
    }

    @Test
    fun sendAndReturnErrorThrowsError() = runTest {
        // TODO spustit networkClient).sendAndReturnError() a zkontrolovat vysledek
        try {
            networkClient.sendAndReturnError()
        } catch (e: Exception) {
            assert(e.message == z"Error")
        }
    }
}

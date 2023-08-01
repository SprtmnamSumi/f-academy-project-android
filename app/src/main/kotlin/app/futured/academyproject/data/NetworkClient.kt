package app.futured.academyproject.data

import kotlinx.coroutines.time.delay

class NetworkClient {

    suspend fun delay_300() {

        kotlinx.coroutines.delay(300)
    }

    suspend fun send(): Int {
        TODO("upravit funkci, aby pockala 300ms a vratila 0")
        delay_300()
        return 0
    }

    suspend fun sendAndReturnError() {
        TODO("upravit funkci, aby pockala 300ms a vyhodila chybu")
        delay_300()
        throw Exception("Error")
    }
}

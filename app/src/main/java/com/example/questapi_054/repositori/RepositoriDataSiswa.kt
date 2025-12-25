package com.example.questapi_054.repositori

import com.example.questapi_054.apiservice.ServiceApiSiswa
import com.example.questapi_054.modeldata.DataSiswa
import retrofit2.Response

interface RepositoriDataSiswa{
    suspend fun getDataSiswa():List<DataSiswa>
    suspend fun  postDataSiswa(dataSiswa: DataSiswa) : retrofit2.Response<Void>
    suspend fun getSatuSiswa(id: Int) : DataSiswa
}

class JaringanRepositoriDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoriDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}

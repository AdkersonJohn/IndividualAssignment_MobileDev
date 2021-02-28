package service.plantdiary.individualassignment3048q.ui.main

import DAO.ICountryDAO
import androidx.lifecycle.MutableLiveData
import app.plantdiary.individualassignment3048q.RetrofitClientInstance
import dto.plantDiaryDTO.Country
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class CountryService {

    fun fetchCountries(countryName: String = "") : MutableLiveData<ArrayList<Country>>{
        var _countries = MutableLiveData<ArrayList<Country>>()
        val service = RetrofitClientInstance.retrofitInstance?.create(ICountryDAO::class.java)
        val call = service?.getAllCountries()
        call?.enqueue(object : retrofit2.Callback<ArrayList<Country>> {
            override fun onFailure(call: Call<ArrayList<Country>>, t: Throwable) {
                val j = 1 + 1
                val i = 1 + 1
            }
            override fun onResponse(
                call: Call<ArrayList<Country>>,
                response: Response<ArrayList<Country>>
            ) {
                _countries.value = response.body()
            }

        })

        return _countries
    }

}

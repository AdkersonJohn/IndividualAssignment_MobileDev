package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dto.plantDiaryDTO.Country
import service.plantdiary.individualassignment3048q.ui.main.CountryService

class MainViewModel : ViewModel() {
    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
    var countryService : CountryService = CountryService()

    init {
        fetchCountries()
    }

    fun fetchCountries() {
        countries = countryService.fetchCountries()
    }
    // TODO: Implement the ViewModel
}

package co.paulfran.paulfranco.countries.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import co.paulfran.paulfranco.countries.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(Country("CountryA"),
                Country("CountryB"),
                Country("CountryC"),
                Country("CountryD"),
                Country("CountryE"),
                Country("CountryF"),
                Country("CountryG"),
                Country("CountryH"),
                Country("CountryI"),
                Country("CountryJ"),
                Country("CountryK"),
                Country("CountryL"),
                Country("CountryM"),
                Country("CountryN")
        )
        countryLoadError.value = false
        loading.value = false
        countries.value = mockData

    }

}
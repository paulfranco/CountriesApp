package co.paulfran.paulfranco.countries.di

import co.paulfran.paulfranco.countries.model.CountriesService
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

}
package co.paulfran.paulfranco.countries.di

import co.paulfran.paulfranco.countries.model.CountriesService
import co.paulfran.paulfranco.countries.viewModel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)

}
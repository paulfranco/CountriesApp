package co.paulfran.paulfranco.countries.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.paulfran.paulfranco.countries.R
import co.paulfran.paulfranco.countries.model.Country
import co.paulfran.paulfranco.countries.util.getProgressDrawable
import co.paulfran.paulfranco.countries.util.loadImage
import kotlinx.android.synthetic.main.item_country.view.*



class CountryListAdapter(var countries: ArrayList<Country>) : RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    fun updateCountries(newCountries: List<Country>) {
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = CountryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val countryName = view.name
        private val imageView = view.imageView
        private val countryCapital = view.capital
        private val progressDrawable = getProgressDrawable(view.context)

        fun bind(country: Country) {
            countryName.text = country.countryName
            countryCapital.text = country.countryName
            imageView.loadImage(country.flag, progressDrawable)
        }
    }

}
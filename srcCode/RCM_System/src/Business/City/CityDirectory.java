/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import java.util.ArrayList;

/**
 *
 * @author Guest
 */
public class CityDirectory {

    private ArrayList<City> cityList;

    public CityDirectory() {
        cityList = new ArrayList<City>();
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    //creating an city and adding it to the list
    public City createAndAddCity(String name, City.CorporationType type) {
        City city = null;
        if (type == City.CorporationType.Electricity) {
            city = new HospitalCity(name);
            cityList.add(city);
        }
        return city;
    }
}

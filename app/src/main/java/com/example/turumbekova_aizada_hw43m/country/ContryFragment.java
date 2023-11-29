package com.example.turumbekova_aizada_hw43m.country;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ContryFragment extends Fragment {
    private FragmentContinentBinding binding;
    private Integer position;
    private ArrayList<CountryModel> countryModels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        bindingb = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryModels);
        binding.recyclerView.setAdapter(countryAdapter);
    }

    private  void  checkPosition(int position) {
        if (position == 0){
            loadEurasia();
        } else if (position == 1) {
            loadNorthAmerica();
        }else if (position == 2) {
            loadSouthAmerica();
        }else if (position == 3) {
            loadAfrica();
        }else if (position == 4) {
            loadAustralia();
        }
    }

    private void loadEurasia(){
        countryModels.add(new CountryModel("https://yandex.ru/search?text=Федеративная%20Республика%20Германия&lr=10309&suggest_reqid=837193380169297989297667403446228&ento=0zH4sIAAAAAAAAAy1Su3KbQBSdSZHMpEyVIn-QTLSAZJsihVleRoCyy0OwHWgVZLFCsnkJfi8flTZ3ZRcMA-dxz7lzP3967celgpZf_n4UbfezFSf8GmBcUcSyA7Jeznin6AN3xcjii8u2DwNRdaVs6LRPjKF8fjx5z8acafxSqOJP6YiZm-dxmxwoPwozNA0W2bbKrUCNkpW5PxpBqHgNs-CPdU2SLNxQZEl-xDRq7hOxITP14jqYAbcAR2Qmb36g34AfF945QfTGD2KDUdtrgI8CWwRJxpD0i50L5WkIeloTrQY9pbyhpj8bbKdeQoKUZZRdvKJWVnFseHuRvsQnQZITr8n0IPURU6m5no2gVHdjbBtS75KjwRLbRnEdajDPknyKgjG2RAN5GwZ8JuwZ8BV8v9z8IH_sXqIiFi6txebGt6EvWrkkNoJCeA1s4_Xml6XQP5X9r6APQL8hUzvGWI-KbKf_JucMV-nEtlfBD08bdtKnMkvbPFaOpap0pbpc59XZ5o5ApZNEW44PyF-QPnQM5N-T_tkkrY6_o9yllY4R8k1aSSz3SQtYj03S6XhEvv-uOZIhdHyUJ5XkdNx5RLkpMQx-oMVL5NcV8jLSdoDBjEF3fHzODVx1c6mlU66m8i764upphUvRzg3u_EmfeLTSim132TlpXWytvtS8xr_dUT2gtQs-4J3Du8N3mY7n2zzumMiPSRvKHNChwxNgS3g06AIZ3jR9iB9QPtBDupAcBTK_ZYUOwy3nkfTpggiOJ9kHZixQ3q796hzuTnYPt9wzRR_zzDuU9InLHQ6wn0Huzl_I3d2jfCE99fdcsI_q19cP3zb_fvwHUYTCyFUDAAA&noreask=1&es_context=0zH4sIAAAAAAAAAz1RO05EMQwsWD4KDTUFokaKiB07dkpAiIaCK7xFr-JpF71lQXsVTsSBOAB5iUOVkTMz9tjr75U7nfdfBIEqSMDRHS-A68PsVuXJ9RMooztZAIRaYKTQ2MEIwu6sAATOXEuoxXDRCGrjAJqJkokUO4i9T-p-amJpBY2tUyIA5wqIQSih6QDaoCjCVjE-xGwOlHIVYo4ak7SU1iX-DxIqB1hihh5ezZxL2hYyYqhCJu3mHWiz5NhDZrB9xGSRLKOWbMuOxYKFnsEUoGCjJ-5bYL64unwBCYApp3K8DCmzj5KJS9KESpKVMIhfD9OweR1nP8k0fo5TQW_79ewP73437Hw5h7-_e_blXnR9dHP-NG5vH7b7zcd8eDz8_P4BtSTRuSECAAA","Germany"));
        countryModels.add(new CountryModel("https://yandex.ru/search?text=Италия&lr=10309&suggest_reqid=837193380169297989297667403446228&ento=0zH4sIAAAAAAAAAy1Sy26bQBSVKrWLLrvqP1SqB7CTUKmLMLyCAXeGh2F24HFxzBg74WX4vPazuukdJwuE4DzuOVf388fXfrxbffn7SbTd91ac8GuAcUURyw7IejnjnaIP3BUjiy8u2z4MRNWVsqHTPjGG8vnx5D0bc6bxS6GK36UjZm6ex21yoPwozNA0WGTbKrcCNUpW5v5oBKHiNcyCP9Y1SbJwQ5El-RHTqLlPxIbM1IvrYAbcAhyRmbz5gX4Dflx45wTRGz-IDUZtrwE-CmwRJBlD0i92LpSnIehpTbQa9JTyhpr-bLCdegkJUpZRdvGKWlnFseHtRfoSnwRJTrwm04PUR0yl5no2glLdjbFtSL1LjgZLbBvFdajBPEvyKQrG2BIN5G0Y8JmwZ8BX8P1y84P8sXuJili4tBabG9-GvmjlktgICuE1sI3Xm1-WQv9U9r-CPgD9hkztGGM9KrKd_oucM1ylE9teBT88bdhJn8osbfNYOZaq0pXqcp1XZ5s7ApVOEm05PiB_QfrQMZB_T_pnk7Q6_oZyl1Y6Rsg3aSWx3CctYD02SafjEfn-u-ZIhtDxUZ5UktNx5xHlpsQw-IEWL5FfV8jLSNsBBjMG3fHxOTdw1c2llk65msq76IurpxUuRTs3uPMnfeLRSiu23WXnpHWxtfpS8xr_dkf1gNYu-IB3Du8O32U6nm_zuGMiPyZtKHNAhw5PgC3h0aALZHjT9CF-QPlAD-lCchTI_JYVOgy3nEfSpwsiOJ5kH5ixQHm79qtzuDvZPdxyzxR9zDPvUNInLnc4wH4GuTt_IXd3j_KF9NTfc8E-qp9fP_z4x__8B6h8_AFTAwAA&noreask=1&es_context=0zH4sIAAAAAAAAAz1RO05EMQwsWD4KDTUFokaKiB07dkpAiIaCK7xFr-JpF71lQXsVTsSBOAB5iUOVkTMz9tjr75U7nfdfBIEqSMDRHS-A68PsVuXJ9RMooztZAIRaYKTQ2MEIwu6sAATOXEuoxXDRCGrjAJqJkokUO4i9T-p-amJpBY2tUyIA5wqIQSih6QDaoCjCVjE-xGwOlHIVYo4ak7SU1iX-DxIqB1hihh5ezZxL2hYyYqhCJu3mHWiz5NhDZrB9xGSRLKOWbMuOxYKFnsEUoGCjJ-5bYL64unwBCYApp3K8DCmzj5KJS9KESpKVMIhfD9OweR1nP8k0fo5TQW_79ewP73437Hw5h7-_e_blXnR9dHP-NG5vH7b7zcd8eDz8_P4BtSTRuSECAAA","Italy"));
        countryModels.add(new CountryModel("","Great Britain"));
        countryModels.add(new CountryModel("","France"));
        countryModels.add(new CountryModel("","Netherlands"));
        countryModels.add(new CountryModel("","Switzerland"));
        countryModels.add(new CountryModel("","Poland"));
        countryModels.add(new CountryModel("","Greece"));
        countryModels.add(new CountryModel("","Ukrain"));
        countryModels.add(new CountryModel("","Belgium"));
    }
    private void loadAustralia(){
        countryModels.add(new CountryModel("","H.C.B"));
        countryModels.add(new CountryModel("","Victoria"));
        countryModels.add(new CountryModel("","Queensland"));
        countryModels.add(new CountryModel("","South Australia"));
        countryModels.add(new CountryModel("","Western Australia"));
        countryModels.add(new CountryModel("","Tasmania"));
    }
    private void loadAfrica(){
        countryModels.add(new CountryModel("","South Africa"));
        countryModels.add(new CountryModel("","Nigeria"));
        countryModels.add(new CountryModel("","Kenya"));
        countryModels.add(new CountryModel("","Morocco"));
        countryModels.add(new CountryModel("","Niger"));
        countryModels.add(new CountryModel("","Ghana"));
    }
    private void loadSouthAmerica(){
        countryModels.add(new CountryModel("","Brazil"));
        countryModels.add(new CountryModel("","Argentina"));
        countryModels.add(new CountryModel("","Peru"));
        countryModels.add(new CountryModel("","Colombia"));
        countryModels.add(new CountryModel("","Chili"));
        countryModels.add(new CountryModel("","Venezuela"));
        countryModels.add(new CountryModel("","Ecuador"));
        countryModels.add(new CountryModel("","Bolovia"));
    }
    private void loadNorthAmerica(){
        countryModels.add(new CountryModel("","Canada"));
        countryModels.add(new CountryModel("","Mexico"));
        countryModels.add(new CountryModel("","Greenland"));
        countryModels.add(new CountryModel("","Cuba"));
        countryModels.add(new CountryModel("","Jamaica"));
        countryModels.add(new CountryModel("","Panama"));
        countryModels.add(new CountryModel("","Haiti"));
    }


}

package com.example.casting.util;

import com.example.casting.ex5.Brand;
import com.example.casting.ex5.DuplicateBrand;
import com.example.casting.ex5.InternationalBrand;
import com.example.casting.ex5.LocalBrand;
import com.example.casting.ex5.NationalBrand;

public class BrandUtil {
	public void run(Brand brand) {

		Brand brand2 = new Brand();
		brand2.name();

		if(brand instanceof LocalBrand)
		{
			Brand local=new LocalBrand();
			local.name();

			LocalBrand local1=(LocalBrand)local;
			local1.local();

		}
		if(brand instanceof NationalBrand)
		{
			Brand national=new NationalBrand();
			national.name();

			NationalBrand national2=(NationalBrand)national;
			national2.national();
		}

		if(brand instanceof InternationalBrand)
		{
			Brand international=new InternationalBrand();
			international.name();

			InternationalBrand international2=(InternationalBrand)international;
			international2.inter();
		}

		if(brand instanceof DuplicateBrand)
		{
			Brand duplicate=new DuplicateBrand();
			duplicate.name();

			DuplicateBrand duplicate2=(DuplicateBrand)duplicate;
			duplicate2.duplicate();
		}
	}

}

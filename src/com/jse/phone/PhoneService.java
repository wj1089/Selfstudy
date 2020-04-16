package com.jse.phone;

import com.jse.phone.Phone.*;

public interface PhoneService {
	
	public Phone[] getPhones() ;
	public void setPhones(Phone[] phones) ;
	public CelPhone[] getCelPhones() ;
	public void setCelPhones(CelPhone[] celPhones) ;
	public Iphone[] getiPhones() ;
	public void setiPhones(Iphone[] iPhones) ;
	public GalaxyNote[] getGalaxyNotes() ;
	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) ;
	public void add(Phone phone);
	public void add(CelPhone phone);
	public void add(Iphone phone);
	public void add(GalaxyNote phone);
	public int getCount() ;
	public void setCount(int count) ;

	
}

package com.jse.phone;


public class PhoneServiceImpl implements PhoneService{
	
	private int count;
	private Phone[] phones;
	private CelPhone[] celPhones;
	private Iphone[] iPhones;
	private GalaxyNote[] galaxyNotes;
	
	public PhoneServiceImpl() {
		count = 0; 
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		iPhones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
	}
	
	@Override
	public void add(Phone phone){
		phones[count] = phone;
	}
	
	@Override
	public void add(CelPhone phone){
		celPhones[count] = phone;
		count++;
	}
	@Override
	public void add(Iphone phone){
		iPhones[count] = phone;
		count++;
	}@Override
	public void add(GalaxyNote phone){
		galaxyNotes[count] = phone;
		count++;
	}


	@Override
	public Phone[] getPhones() {
		return phones;
	}


	@Override
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}


	@Override
	public CelPhone[] getCelPhones() {
		return celPhones;
	}


	@Override
	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}


	@Override
	public Iphone[] getiPhones() {
		return iPhones;
	}


	@Override
	public void setiPhones(Iphone[] iPhones) {
		this.iPhones=iPhones;
	}


	@Override
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}


	@Override
	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes=galaxyNotes;
	}


	@Override
	public int getCount() {
		return 0;
	}


	@Override
	public void setCount(int count) {
		
	}

}
	
	
package com.jse.phone;

public class Phone {
	
	private String phoneNumber;
	private String name;
	private String company;
	
	public Phone(String phoneNumber, String name, String company) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.company = company;
	}
	
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Phone phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company + "]";
	}
	
	
	
	public class CelPhone extends Phone{
		
		public CelPhone(String phoneNumber, String name, String company, String move) {
			super(phoneNumber, name, company);
		}
		private boolean portable;
		private String move;
		
		public boolean isPortable() {
			return portable;
		}
		public void setPortable(boolean portable) {
			this.move= (portable)? "휴대가능" : "휴대불가능";
		}
		public String getMove() {
			return move;
		}
		public void setMove(String move) {
			this.move = move;
		}
		@Override
		public String toString() {
			return "CelPhone [portable=" + portable + ", move=" + move + "]";
		}
	}
	
	
	 public class Iphone extends CelPhone {
			
			
			public Iphone(String phoneNumber, String name, String company, String move, String Search) {
				super(phoneNumber, name, company, move);
			}

			private String search;

			public String getSearch() {
				return search;
			}

			public void setSearch(String search) {
				this.search = search;
			}
		
			@Override
			public String toString() {
				return "Iphone [search=" + search + "]";
			}
		}
	 
	 
	public class GalaxyNote extends Iphone{
				
				
				private String bigSize;

				public GalaxyNote(String phoneNumber, String name, String company, String move, String search,String bidSize) {
					super(phoneNumber, name, company, move, search);
				}

				@Override
				public String toString() {
					return "GalaxyNote [bigSize=" + bigSize + "]";
				}
			}	
		}

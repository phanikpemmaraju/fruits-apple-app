package org.github.phani.apple.app;

public class Apple {
	
	private String colour;
	private Integer weight;
	private Taste taste;
	private Boolean isWorm;

	public Apple(){		
	}
	
	public Apple(String colour,Integer weight,Taste taste,Boolean isWorm){
		this.colour = colour;
		this.taste = taste;
		this.isWorm = isWorm;
		if(weight < 10 || weight > 100)
			throw new IllegalArgumentException("Illegal weight value : " + Integer.toString(weight) + " provided. Valid values are between 10 and 100 inclusive");
		this.weight = weight;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Taste getTaste() {
		return taste;
	}
	public void setTaste(Taste taste) {
		this.taste = taste;
	}
	
	public Boolean getIsWorm() {
		return isWorm;
	}

	public void setIsWorm(Boolean isWorm) {
		this.isWorm = isWorm;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((isWorm == null) ? 0 : isWorm.hashCode());
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (isWorm == null) {
			if (other.isWorm != null)
				return false;
		} else if (!isWorm.equals(other.isWorm))
			return false;
		if (taste != other.taste)
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apple [colour=" + colour + ", weight=" + weight + ", taste=" + taste + ", isWorm=" + isWorm + "]";
	}
	
	
}

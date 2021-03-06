package ems.DataSubsystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class used for the sole purpose of representing 
 * the state of a booth object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.BoothRepository}.
 * @author emsTeam
 */
@Entity
@Table (name="booths")
public class Booth {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	/**
	 * Amount paid for each booth.
	 */
	public double price;
	/**
	 * Number of booths booked.
	 */
	public Integer count;
	/**
	 * Size of the booths booked.
	 */
	public String size;
	/**
	 * Getter of price
	 */
	public double getPrice() {
	 	 return price; 
	}
	/**
	 * Setter of price
	 */
	public void setPrice(double price) { 
		 this.price = price; 
	}
	/**
	 * Getter of count
	 */
	public Integer getCount() {
	 	 return count; 
	}
	/**
	 * Setter of count
	 */
	public void setCount(Integer count) { 
		 this.count = count; 
	}
	/**
	 * Getter of size
	 */
	public String getSize() {
	 	 return size; 
	}
	/**
	 * Setter of size
	 */
	public void setSize(String size) { 
		 this.size = size; 
	} 

}

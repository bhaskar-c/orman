package demo3;

import org.orman.mapper.Model;
import org.orman.mapper.annotation.Entity;
import org.orman.mapper.annotation.Index;
import org.orman.mapper.annotation.PrimaryKey;
import org.orman.sql.IndexType;

@Entity
public class Ticket extends Model<Ticket>{
	@PrimaryKey
	public long id;
	
	@PrimaryKey
	public String seat;
	
	@Index(type=IndexType.BTREE)
	public Payment payment;
	
	@Override
	public String toString() {
		return  "ID:"+id + " " + seat + " " + ((payment == null) ? null : payment.amount)+"\n";
	}
}

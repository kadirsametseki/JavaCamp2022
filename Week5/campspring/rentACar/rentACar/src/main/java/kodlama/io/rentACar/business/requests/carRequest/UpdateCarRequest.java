package kodlama.io.rentACar.business.requests.carRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {
	
	private int id;
	private int brandId;
	private String name;
	private double unitPrice;
	private int unitsInStock;
}

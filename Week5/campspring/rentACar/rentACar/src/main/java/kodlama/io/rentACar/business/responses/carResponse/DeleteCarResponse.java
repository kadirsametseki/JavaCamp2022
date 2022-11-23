package kodlama.io.rentACar.business.responses.carResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCarResponse {
	private int id;
	private int brandId;
	private String name;
	private double unitPrice;
	private int unitsInStock;
}

package kodlama.io.rentACar.business.responses.carResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarResponse {
	private int id;
	private String name;
	private int brandId;
	private double unitPrice;
	private int unitInStock;
}

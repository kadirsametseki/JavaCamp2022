package kodlama.io.rentACar.business.responses.brandResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteBrandResponse {
	private int id;
	private String name;
}

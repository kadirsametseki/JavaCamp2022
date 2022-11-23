package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.carRequest.CreateCarRequest;
import kodlama.io.rentACar.business.requests.carRequest.DeleteCarRequest;
import kodlama.io.rentACar.business.requests.carRequest.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.carResponse.CreateCarResponse;
import kodlama.io.rentACar.business.responses.carResponse.DeleteCarResponse;
import kodlama.io.rentACar.business.responses.carResponse.UpdateCarResponse;

public interface CarService {
	CreateCarResponse add(CreateCarRequest createCarRequest);
	UpdateCarResponse update(UpdateCarRequest updateCarRequest);
	DeleteCarResponse delete(DeleteCarRequest deleteCarRequest);
	
}

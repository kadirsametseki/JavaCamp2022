package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.brandRequest.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brandRequest.DeleteBrandRequest;
import kodlama.io.rentACar.business.requests.brandRequest.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.brandResponse.CreateBrandResponse;
import kodlama.io.rentACar.business.responses.brandResponse.DeleteBrandResponse;
import kodlama.io.rentACar.business.responses.brandResponse.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.brandResponse.UpdateBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();  //yanıt veriyoruz
	CreateBrandResponse add (CreateBrandRequest createBrandRequest);  // istek alıyoruz
	UpdateBrandResponse update(UpdateBrandRequest updateBrandRequest);
	DeleteBrandResponse delete(DeleteBrandRequest deleteBrandRequest);
}

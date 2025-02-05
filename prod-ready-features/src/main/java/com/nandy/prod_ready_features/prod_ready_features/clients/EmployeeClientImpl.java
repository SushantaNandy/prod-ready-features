package com.nandy.prod_ready_features.prod_ready_features.clients;

import com.nandy.prod_ready_features.prod_ready_features.advice.ApiResponse;
import com.nandy.prod_ready_features.prod_ready_features.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeClientImpl implements EmployeeClient{

    private final RestClient restClient;
    

    @Override
    public List<EmployeeDTO>
    getAllEmployees() {

        try{
            ApiResponse<List<EmployeeDTO>> employeeDTOList = restClient.get().
                    uri("employees").
                    retrieve().
                    body(new ParameterizedTypeReference<>() {
                    });
            return employeeDTOList.getData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
        try{
            ApiResponse<EmployeeDTO> employeeResponse = restClient.get().
                    uri("employees/{employeeID}", employeeId).
                    retrieve().
                    body(new ParameterizedTypeReference<>() {
                    });
            return employeeResponse.getData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDTO createNewEmployee(EmployeeDTO inputEmployee) {
        try{
            ApiResponse<EmployeeDTO> employeeResponse = restClient.post().
                    uri("employees").
                    body(inputEmployee).
                    retrieve().
                    body(new ParameterizedTypeReference<>() {
            });
            return employeeResponse.getData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

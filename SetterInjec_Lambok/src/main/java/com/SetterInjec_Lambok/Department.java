package com.SetterInjec_Lambok;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department 
{
	private int departmentId;
    private String departmentName;
    private String departmentLocation;
    

}

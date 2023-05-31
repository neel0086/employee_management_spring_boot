import axios from 'axios'
const url = "http://localhost:8080/api/v1/employees"

class EmployeeService{
    createEmployee = async(employee)=>{
        try {
            return await axios.post(`${url}`, employee);
        } catch (error) {
            console.log('Error while calling createEmployee API ', error);
        }
    }
}
export default new EmployeeService()

package pro.sky.homeWork20;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping(path = "/EmployeeBook/add")
    public String addWorker(@RequestParam("name") String name,
                            @RequestParam("department") Integer department,
                            @RequestParam("salary") Integer salary) {
        storageService.addWorker(new Employee(name, department, salary));
        return "Сотрудник успешно добавлен!";
    }

    @GetMapping(path = "/EmployeeBook/remove")
    public String removeWorker(@RequestParam("name") String name) {
        storageService.removeWorker(name);
        return "Сотрудник успешно удалён!";
    }

    @GetMapping(path = "/EmployeeBook/find")
    public Employee findWorker(@RequestParam("name") String name) {
        return storageService.findWorker(name);
    }
}

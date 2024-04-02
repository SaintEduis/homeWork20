package pro.sky.homeWork20;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StorageServiceImp implements StorageService {
    private Map<String, Employee> storageOfWorkers = new HashMap<>();

    @Override
    public void addWorker(Employee newWorker) {
        storageOfWorkers.put(newWorker.getFullNameOfWorker(), newWorker);
    }

    @Override
    public void removeWorker(String name) {
        storageOfWorkers.remove(name);
    }

    @Override
    public Employee findWorker(String name) {
        return storageOfWorkers.get(name);
    }
}

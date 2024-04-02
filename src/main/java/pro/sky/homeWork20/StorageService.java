package pro.sky.homeWork20;

import java.util.HashMap;
import java.util.Map;

public interface StorageService {
    void addWorker(Employee newWorker);

    void removeWorker(String name);

    Employee findWorker(String name);
}
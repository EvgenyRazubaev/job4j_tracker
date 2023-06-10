package ru.job4j.tracker;

public class FindItemByIDAction implements  UserAction {
    @Override
    public String name() {
        return "Find item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by ID ===");
        int id = input.askInt("Введите id заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введеным id: " + id + " не найдена.");
        }
        return true;
    }
}

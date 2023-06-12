package ru.job4j.tracker;

public class FindItemByIDAction implements  UserAction {
    public final Output out;

    public FindItemByIDAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by ID ===");
        int id = input.askInt("Введите id заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введеным id: " + id + " не найдена.");
        }
        return true;
    }
}

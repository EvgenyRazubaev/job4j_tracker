package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenCorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu.");
        assertThat(selected).isEqualTo(0);
    }

    @Test
    public void whenMultiCorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2", "4", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu.");
        assertThat(selected).isEqualTo(2);
        int selectedSecond = input.askInt("Enter menu.");
        assertThat(selectedSecond).isEqualTo(4);
        int selectedThird = input.askInt("Enter menu.");
        assertThat(selectedThird).isEqualTo(3);
    }

    @Test
    public void whenInputNegative() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu.");
        assertThat(selected).isEqualTo(-1);
    }
}
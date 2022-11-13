package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("로또 번호에 1-45 이외이 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByrightrange() {
        assertThatThrownBy(() -> new Lotto(List.of(100, 2, 3, 4, 5, 6)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 보너스 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedBonusNumber() {
        assertThatThrownBy(() -> Target_Lotto.bonus_num(new Lotto(List.of(1, 2, 3, 4, 5, 6)),1))
                .isInstanceOf(IllegalArgumentException.class);
    }
    // 아래에 추가 테스트 작성 가능
}

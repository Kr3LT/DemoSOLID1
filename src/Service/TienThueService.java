package Service;

import Interface.ITienThue;

import java.time.Duration;
import java.util.Date;

public class TienThueService implements ITienThue {

    @Override
    public Long tinhTienThueXeDap(Date inDate, Date outDate) {
        Duration thoiGianThue = Duration.between(inDate.toInstant(),outDate.toInstant());
        Long tienThue = thoiGianThue.toDays() * 1000;
        return tienThue;
    }

    @Override
    public Long tinhTienThueXeMay(Date inDate, Date outDate) {
        Duration thoiGianThue = Duration.between(inDate.toInstant(),outDate.toInstant());
        Long tienThue = thoiGianThue.toDays() * 3000;
        return tienThue;
    }

    @Override
    public Long tinhTienThueXe4Banh(Date inDate, Date outDate) {
        Duration thoiGianThue = Duration.between(inDate.toInstant(),outDate.toInstant());
        Long tienThue = thoiGianThue.toMinutes()/30 * 5000 + thoiGianThue.toMinutes()%30>0?1L:0L;
        return tienThue;
    }
}

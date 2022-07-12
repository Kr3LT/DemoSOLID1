package Interface;

import java.util.Date;

public interface ITienThue {
    Long tinhTienThueXeDap(Date inDate, Date outDate);
    Long tinhTienThueXeMay(Date inDate, Date outDate);
    Long tinhTienThueXe4Banh(Date inDate, Date outDate);
}

package Entity;

import java.util.Date;

public class ThongTinVeXe {
    private Date thoiGianVaoBai;
    private Date thoiGianRaBai;
    private Long tienThue;

    public ThongTinVeXe() {
    }

    public Date getThoiGianVaoBai() {
        return thoiGianVaoBai;
    }

    public void setThoiGianVaoBai(Date thoiGianVaoBai) {
        this.thoiGianVaoBai = thoiGianVaoBai;
    }

    public Date getThoiGianRaBai() {
        return thoiGianRaBai;
    }

    public void setThoiGianRaBai(Date thoiGianRaBai) {
        this.thoiGianRaBai = thoiGianRaBai;
    }

    public Long getTienThue() {
        return tienThue;
    }
    public void setTienThue(Long tienThue) {
        this.tienThue = tienThue;
    }
}

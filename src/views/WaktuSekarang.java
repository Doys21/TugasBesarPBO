package views;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WaktuSekarang {
    private LocalDateTime wkt;
    private String $jam = "", $menit = "", $detik = "";

    public String getWkt() {
        wkt = LocalDateTime.now();
        int jam = wkt.getHour();
        int menit = wkt.getMinute();
        int detik = wkt.getSecond();

        $jam = jam < 10 ? "0" : "";
        $menit = menit < 10 ? "0" : "";
        $detik = detik < 10 ? "0" : "";

        return $jam + jam + ":" + $menit + menit + ":" + $detik + detik;
    }

    public String getTgl() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDateTime.now().format(formatter);
    }
}

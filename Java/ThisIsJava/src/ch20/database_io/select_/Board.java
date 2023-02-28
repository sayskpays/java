package ch20.database_io.select_;

import lombok.Data;

import java.sql.Blob;
import java.sql.Date;


@Data
public class Board {
    private int BNO;
    private String BTITLE;
    private String BCONTENT;
    private String BWRITER;
    private Date BDATE;
    private String BFILENAME;
    private Blob BFILEDATA;
}

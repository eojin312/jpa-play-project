package captain.avengersproject.sample.entitiy;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 닷컴지역
 */
@Entity
@Getter
public class MpsDarM {

    @Id
    private long id;
    private String darId;
    private String dtcmAreaNm;
    private String darDesc;
    private String darCatgId;
    private String darGrpTypeCd;
    private String darTypeCd;
    private String darIndvCd;
    private String cntntId;
    private String cntryCntntId;
    private String brwsNoc;
    private String exprYn;
    private String inpDttm;
    private String inprId;
    private String inpPrgmId;
    private String updDttm;
    private String updrId;
    private String updPrgmId;
}

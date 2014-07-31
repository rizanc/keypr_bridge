package com.cloudkey.pms.request;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by crizan2 on 31/07/2014.
 */
public class PostChargeRequest {
    private Date postDate;
    private String shortInfo;
    private String longInfo;
    private BigDecimal chargeAmount;
    private String stationId;
    private String userId;
    private int folioViewNo;
    private String account;
    private String article;
    private String reservationId;

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public String getLongInfo() {
        return longInfo;
    }

    public void setLongInfo(String longInfo) {
        this.longInfo = longInfo;
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getFolioViewNo() {
        return folioViewNo;
    }

    public void setFolioViewNo(int folioViewNo) {
        this.folioViewNo = folioViewNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
}

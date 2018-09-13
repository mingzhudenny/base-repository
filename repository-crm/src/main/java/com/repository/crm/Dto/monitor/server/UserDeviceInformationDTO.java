package com.repository.crm.Dto.monitor.server;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description：用户设备信息
 * @author： denny
 * @create： 2018-06-22 14:01
 **/
public class UserDeviceInformationDTO {
    private String  computerModel;

    private String operationSystem;

    private String processor;

    private String motherboard;

    private String ram;

    private String hardDisk;

    private String graphicsCard;

    private String monitor;

    private String opticalDrive;

    private String soundCard;

    private String networkCard;

    private String battery;

    private String systemVersion;

    private String computerName;

    private String systemInstallationDate;

    private String SystemStartupTime;

    private String manufacturer;

    private String systemLanguage;

    private String systemStructure;

    private String ipAddress;

    private  String macAddress;

    private  String microphoneEquipment;

    private  String speakerEquipment;

    private  String cameraEquipment;

    private  String tabletDevice;

    private  String lastTestTime;

    private  String deviceType;

    private Integer userType;

    private String  loginAccount;

    private String remark;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getComputerModel() {
        return computerModel;
    }

    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public String getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(String soundCard) {
        this.soundCard = soundCard;
    }

    public String getNetworkCard() {
        return networkCard;
    }

    public void setNetworkCard(String networkCard) {
        this.networkCard = networkCard;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getSystemInstallationDate() {
        return systemInstallationDate;
    }

    public void setSystemInstallationDate(String systemInstallationDate) {
        this.systemInstallationDate = systemInstallationDate;
    }

    public String getSystemStartupTime() {
        return SystemStartupTime;
    }

    public void setSystemStartupTime(String systemStartupTime) {
        SystemStartupTime = systemStartupTime;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSystemLanguage() {
        return systemLanguage;
    }

    public void setSystemLanguage(String systemLanguage) {
        this.systemLanguage = systemLanguage;
    }

    public String getSystemStructure() {
        return systemStructure;
    }

    public void setSystemStructure(String systemStructure) {
        this.systemStructure = systemStructure;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getMicrophoneEquipment() {
        return microphoneEquipment;
    }

    public void setMicrophoneEquipment(String microphoneEquipment) {
        this.microphoneEquipment = microphoneEquipment;
    }

    public String getSpeakerEquipment() {
        return speakerEquipment;
    }

    public void setSpeakerEquipment(String speakerEquipment) {
        this.speakerEquipment = speakerEquipment;
    }

    public String getCameraEquipment() {
        return cameraEquipment;
    }

    public void setCameraEquipment(String cameraEquipment) {
        this.cameraEquipment = cameraEquipment;
    }

    public String getTabletDevice() {
        return tabletDevice;
    }

    public void setTabletDevice(String tabletDevice) {
        this.tabletDevice = tabletDevice;
    }

    public String getLastTestTime() {
        return lastTestTime;
    }

    public void setLastTestTime(String lastTestTime) {
        this.lastTestTime = lastTestTime;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(createDate);
        return date;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}

package in.BatchTask2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PART_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "partReference")
    private String partReference;

    @Column(name = "partRefer")
    private String partRefer;

    @Column(name = "rcCode")
    private String rcCode;

    @Column(name = "digitPart")
    private String digitPart;

    @Column(name = "supplierCode")
    private String supplierCode;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "tgpSuppliersCode")
    private String tgpSuppliersCode;

    @Column(name = "partLabel")
    private String partLabel;

    @Column(name = "moduleQuantity")
    private Integer moduleQuantity;

    @Column(name = "moduleType")
    private String moduleType;

    @Column(name = "moduleVolume")
    private Double moduleVolume;

    @Column(name = "moduleWeightFull")
    private Double moduleWeightFull;

    @Column(name = "partWeightUnit")
    private Double partWeightUnit;

    @Column(name = "moduleLength")
    private Integer moduleLength;

    @Column(name = "moduleWidth")
    private Integer moduleWidth;

    @Column(name = "moduleHeight")
    private Integer moduleHeight;
    
    

    @Column(name = "partSpecificPackagingCode")
    private String partSpecificPackagingCode;

	public String getPartReference() {
		return partReference;
	}

	public void setPartReference(String partReference) {
		this.partReference = partReference;
	}

	public String getPartRefer() {
		return partRefer;
	}

	public void setPartRefer(String partRefer) {
		this.partRefer = partRefer;
	}

	public String getRcCode() {
		return rcCode;
	}

	public void setRcCode(String rcCode) {
		this.rcCode = rcCode;
	}

	public String getDigitPart() {
		return digitPart;
	}

	public void setDigitPart(String digitPart) {
		this.digitPart = digitPart;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTgpSuppliersCode() {
		return tgpSuppliersCode;
	}

	public void setTgpSuppliersCode(String tgpSuppliersCode) {
		this.tgpSuppliersCode = tgpSuppliersCode;
	}

	public String getPartLabel() {
		return partLabel;
	}

	public void setPartLabel(String partLabel) {
		this.partLabel = partLabel;
	}

	public Integer getModuleQuantity() {
		return moduleQuantity;
	}

	public void setModuleQuantity(Integer moduleQuantity) {
		this.moduleQuantity = moduleQuantity;
	}

	public String getModuleType() {
		return moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public Double getModuleVolume() {
		return moduleVolume;
	}

	public void setModuleVolume(Double moduleVolume) {
		this.moduleVolume = moduleVolume;
	}

	public Double getModuleWeightFull() {
		return moduleWeightFull;
	}

	public void setModuleWeightFull(Double moduleWeightFull) {
		this.moduleWeightFull = moduleWeightFull;
	}

	public Double getPartWeightUnit() {
		return partWeightUnit;
	}

	public void setPartWeightUnit(Double partWeightUnit) {
		this.partWeightUnit = partWeightUnit;
	}

	public Integer getModuleLength() {
		return moduleLength;
	}

	public void setModuleLength(Integer moduleLength) {
		this.moduleLength = moduleLength;
	}

	public Integer getModuleWidth() {
		return moduleWidth;
	}

	public void setModuleWidth(Integer moduleWidth) {
		this.moduleWidth = moduleWidth;
	}

	public Integer getModuleHeight() {
		return moduleHeight;
	}

	public void setModuleHeight(Integer moduleHeight) {
		this.moduleHeight = moduleHeight;
	}

	public String getPartSpecificPackagingCode() {
		return partSpecificPackagingCode;
	}

	public void setPartSpecificPackagingCode(String partSpecificPackagingCode) {
		this.partSpecificPackagingCode = partSpecificPackagingCode;
	}

}

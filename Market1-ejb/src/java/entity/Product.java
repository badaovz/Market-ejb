/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author datvl
 */
@Entity
@Table(name = "Product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"),
    @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name"),
    @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price"),
    @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description"),
    @NamedQuery(name = "Product.findByImg", query = "SELECT p FROM Product p WHERE p.img = :img"),
    @NamedQuery(name = "Product.findBySize", query = "SELECT p FROM Product p WHERE p.size = :size"),
    @NamedQuery(name = "Product.findById2", query = "SELECT p FROM Product p WHERE p.id2 = :id2"),
    @NamedQuery(name = "Product.findById3", query = "SELECT p FROM Product p WHERE p.id3 = :id3"),
    @NamedQuery(name = "Product.findById4", query = "SELECT p FROM Product p WHERE p.id4 = :id4"),
    @NamedQuery(name = "Product.findByDiscriminator", query = "SELECT p FROM Product p WHERE p.discriminator = :discriminator")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private float price;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Size(max = 255)
    @Column(name = "Img")
    private String img;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Size")
    private int size;
    @Column(name = "Id2")
    private Integer id2;
    @Column(name = "Id3")
    private Integer id3;
    @Column(name = "Id4")
    private Integer id4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Discriminator")
    private String discriminator;
    @JoinTable(name = "Category_Product", joinColumns = {
        @JoinColumn(name = "ProductId", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "CategoryId", referencedColumnName = "Id")})
    @ManyToMany
    private Collection<Category> categoryCollection;
    @ManyToMany(mappedBy = "productCollection")
    private Collection<Customer> customerCollection;
    @ManyToMany(mappedBy = "productCollection")
    private Collection<Type> typeCollection;
    @ManyToMany(mappedBy = "productCollection")
    private Collection<Discount> discountCollection;
    @ManyToMany(mappedBy = "productCollection")
    private Collection<Cart> cartCollection;
    @JoinTable(name = "Guaranty_Product", joinColumns = {
        @JoinColumn(name = "ProductId", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "GuarantyId", referencedColumnName = "Id")})
    @ManyToMany
    private Collection<Guaranty> guarantyCollection;
    @JoinTable(name = "Provider_Product", joinColumns = {
        @JoinColumn(name = "ProductId", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "ProviderPersonId", referencedColumnName = "PersonId")})
    @ManyToMany
    private Collection<Provider> providerCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Wine wine;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Jewelry jewelry;
    @JoinColumn(name = "BrandId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Brand brandId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Uniform uniform;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private CookingFood cookingFood;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Computer computer;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Story story;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private BiographiesBook biographiesBook;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private SkillBook skillBook;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private BoxedFood boxedFood;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Shoe shoe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<OrderDetail> orderDetailCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private VegetarianFood vegetarianFood;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Laptop laptop;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Rating> ratingCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private CellPhone cellPhone;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private ScienceBook scienceBook;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Fridge fridge;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Watch watch;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private GirlFashion girlFashion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private HomeElectronic homeElectronic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Comment> commentCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private BoyFashion boyFashion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private EconomicBook economicBook;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Fashion fashion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Quantity> quantityCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private FastFood fastFood;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private StudyBook studyBook;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Television television;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private WomenFashion womenFashion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private MenFashion menFashion;

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }

    public Product(Integer id, float price, int size, String discriminator) {
        this.id = id;
        this.price = price;
        this.size = size;
        this.discriminator = discriminator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public Integer getId3() {
        return id3;
    }

    public void setId3(Integer id3) {
        this.id3 = id3;
    }

    public Integer getId4() {
        return id4;
    }

    public void setId4(Integer id4) {
        this.id4 = id4;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @XmlTransient
    public Collection<Category> getCategoryCollection() {
        return categoryCollection;
    }

    public void setCategoryCollection(Collection<Category> categoryCollection) {
        this.categoryCollection = categoryCollection;
    }

    @XmlTransient
    public Collection<Customer> getCustomerCollection() {
        return customerCollection;
    }

    public void setCustomerCollection(Collection<Customer> customerCollection) {
        this.customerCollection = customerCollection;
    }

    @XmlTransient
    public Collection<Type> getTypeCollection() {
        return typeCollection;
    }

    public void setTypeCollection(Collection<Type> typeCollection) {
        this.typeCollection = typeCollection;
    }

    @XmlTransient
    public Collection<Discount> getDiscountCollection() {
        return discountCollection;
    }

    public void setDiscountCollection(Collection<Discount> discountCollection) {
        this.discountCollection = discountCollection;
    }

    @XmlTransient
    public Collection<Cart> getCartCollection() {
        return cartCollection;
    }

    public void setCartCollection(Collection<Cart> cartCollection) {
        this.cartCollection = cartCollection;
    }

    @XmlTransient
    public Collection<Guaranty> getGuarantyCollection() {
        return guarantyCollection;
    }

    public void setGuarantyCollection(Collection<Guaranty> guarantyCollection) {
        this.guarantyCollection = guarantyCollection;
    }

    @XmlTransient
    public Collection<Provider> getProviderCollection() {
        return providerCollection;
    }

    public void setProviderCollection(Collection<Provider> providerCollection) {
        this.providerCollection = providerCollection;
    }

    public Wine getWine() {
        return wine;
    }

    public void setWine(Wine wine) {
        this.wine = wine;
    }

    public Jewelry getJewelry() {
        return jewelry;
    }

    public void setJewelry(Jewelry jewelry) {
        this.jewelry = jewelry;
    }

    public Brand getBrandId() {
        return brandId;
    }

    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }

    public Uniform getUniform() {
        return uniform;
    }

    public void setUniform(Uniform uniform) {
        this.uniform = uniform;
    }

    public CookingFood getCookingFood() {
        return cookingFood;
    }

    public void setCookingFood(CookingFood cookingFood) {
        this.cookingFood = cookingFood;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public BiographiesBook getBiographiesBook() {
        return biographiesBook;
    }

    public void setBiographiesBook(BiographiesBook biographiesBook) {
        this.biographiesBook = biographiesBook;
    }

    public SkillBook getSkillBook() {
        return skillBook;
    }

    public void setSkillBook(SkillBook skillBook) {
        this.skillBook = skillBook;
    }

    public BoxedFood getBoxedFood() {
        return boxedFood;
    }

    public void setBoxedFood(BoxedFood boxedFood) {
        this.boxedFood = boxedFood;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    @XmlTransient
    public Collection<OrderDetail> getOrderDetailCollection() {
        return orderDetailCollection;
    }

    public void setOrderDetailCollection(Collection<OrderDetail> orderDetailCollection) {
        this.orderDetailCollection = orderDetailCollection;
    }

    public VegetarianFood getVegetarianFood() {
        return vegetarianFood;
    }

    public void setVegetarianFood(VegetarianFood vegetarianFood) {
        this.vegetarianFood = vegetarianFood;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @XmlTransient
    public Collection<Rating> getRatingCollection() {
        return ratingCollection;
    }

    public void setRatingCollection(Collection<Rating> ratingCollection) {
        this.ratingCollection = ratingCollection;
    }

    public CellPhone getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(CellPhone cellPhone) {
        this.cellPhone = cellPhone;
    }

    public ScienceBook getScienceBook() {
        return scienceBook;
    }

    public void setScienceBook(ScienceBook scienceBook) {
        this.scienceBook = scienceBook;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public GirlFashion getGirlFashion() {
        return girlFashion;
    }

    public void setGirlFashion(GirlFashion girlFashion) {
        this.girlFashion = girlFashion;
    }

    public HomeElectronic getHomeElectronic() {
        return homeElectronic;
    }

    public void setHomeElectronic(HomeElectronic homeElectronic) {
        this.homeElectronic = homeElectronic;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection() {
        return commentCollection;
    }

    public void setCommentCollection(Collection<Comment> commentCollection) {
        this.commentCollection = commentCollection;
    }

    public BoyFashion getBoyFashion() {
        return boyFashion;
    }

    public void setBoyFashion(BoyFashion boyFashion) {
        this.boyFashion = boyFashion;
    }

    public EconomicBook getEconomicBook() {
        return economicBook;
    }

    public void setEconomicBook(EconomicBook economicBook) {
        this.economicBook = economicBook;
    }

    public Fashion getFashion() {
        return fashion;
    }

    public void setFashion(Fashion fashion) {
        this.fashion = fashion;
    }

    @XmlTransient
    public Collection<Quantity> getQuantityCollection() {
        return quantityCollection;
    }

    public void setQuantityCollection(Collection<Quantity> quantityCollection) {
        this.quantityCollection = quantityCollection;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public StudyBook getStudyBook() {
        return studyBook;
    }

    public void setStudyBook(StudyBook studyBook) {
        this.studyBook = studyBook;
    }

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }

    public WomenFashion getWomenFashion() {
        return womenFashion;
    }

    public void setWomenFashion(WomenFashion womenFashion) {
        this.womenFashion = womenFashion;
    }

    public MenFashion getMenFashion() {
        return menFashion;
    }

    public void setMenFashion(MenFashion menFashion) {
        this.menFashion = menFashion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Product[ id=" + id + " ]";
    }
    
}

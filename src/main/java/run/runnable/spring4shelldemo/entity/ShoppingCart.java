package run.runnable.spring4shelldemo.entity;

/**
 * @author Asher
 * on 2022/4/17
 */
public class ShoppingCart {

    private Integer userId;

    private Long total;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "userId=" + userId +
                ", total=" + total +
                '}';
    }
}

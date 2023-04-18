import { Product } from "@/common/types/cart";
import { NextPage } from "next";
import { ListGroupItem } from "react-bootstrap";

const stockMessage = "Out of Stock";
const ProductItem: NextPage<{ product: Product; key: number }> = ({
  product,
  key,
}) => {
  return (
    <ListGroupItem className="product" key={key}>
      <h3 className="product-title">{product.title}</h3>
      <p className="product-description">{product.description}</p>
      <p>
        $ <span className="product-price">{product.price}</span>
      </p>
      <p className="out-of-stock text-warning">
        {product.stock <= 0 ? stockMessage : ""}
      </p>
    </ListGroupItem>
  );
};
export default ProductItem;

# 1. Price Check

There is a shop with old-style cash registers. Rather than scanning items and pulling the price from a database, the price of each item is typed in manually. This method sometimes leads to errors. Given a list of items and their correct prices, compare the prices to those entered when each item was sold. Determine the number of errors in selling prices.

## Example

```text
products = ['eggs', 'milk', 'cheese']
productPrices = [2.89, 3.29, 5.79]
productSold = ['eggs', 'eggs', 'cheese', 'milk']
soldPrice = [2.89, 2.99, 5.97, 3.29]
```

| Product | Price (Actual) | Price (Expected) | Error |
|---------|----------------|------------------|-------|
| eggs    | 2.89           | 2.89             |       |
| eggs    | 2.99           | 2.89             | 1     |
| cheese  | 5.97           | 5.79             | 1     |
| milk    | 3.29           | 3.29             |       |

The second sale of eggs has a wrong price, as does the sale of cheese.  
There are 2 errors in pricing.

---

## Function Description

Complete the function `priceCheck` in the editor below.

`priceCheck` has the following parameter(s):

- `string products[n]`: each `products[i]` is the name of an item for sale  
- `float productPrices[n]`: each `productPrices[i]` is the price of `products[i]`  
- `string productSold[m]`: each `productSold[j]` is the name of a product sold  
- `float soldPrice[m]`: each `soldPrice[j]` contains the sale price recorded for `productSold[j]`  

**Returns:**

- `int`: the number of sale prices that were entered incorrectly

---

## Constraints

- 1 ≤ n ≤ 10⁵  
- 1 ≤ m ≤ n  
- 1.00 ≤ `productPrices[i]`, `soldPrice[j]` ≤ 100000.00  
- where 0 ≤ i < n, and 0 ≤ j < m  

---

## Input Format for Custom Testing

Input from stdin will be processed as follows and passed to the function:

The first line contains an integer `n`, the size of the `products` array.

---

## Sample Case 0

### Sample Input 0

```text
4
rice
sugar
wheat
cheese
4
16.89
56.92
20.89
345.99
2
rice
cheese
2
18.99
400.89
```

### Sample Output 0

```text
2
```

### Explanation 0

| Product | Price (Actual) | Price (Expected) | Error |
|---------|----------------|------------------|-------|
| rice    | 18.99          | 16.89            | 1     |
| cheese  | 400.89         | 345.99           | 1     |

There are 2 pricing errors in total.

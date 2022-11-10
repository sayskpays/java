
(name, price) = ("제목","가격")

books = [
    { name: "혼자 공부",
    price: 18000
},{name: "딥러닝",
   price: 15000},
    {name:"자바",
     price:10000}
]

min_price = min(books, key=lambda book: book[price])
print(min_price[price])

books.sort(key=lambda a:a[price])

for book in books:
    print(book)


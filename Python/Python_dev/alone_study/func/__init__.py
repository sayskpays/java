
def call_10_tiems(func):
    for i in range(10):
        func()

def print_hello(x):
    print(f"안녕하세요{x}")

call_10_tiems(print_hello(str(1)))


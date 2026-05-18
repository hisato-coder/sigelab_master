use std::io;

fn iszero(m: i32) -> bool { m == 0 }
fn pi(m: i32) -> i32 { if m == 0 { 0 } else { m - 1 } }

fn lt(m: i32, n: i32) -> bool {
    if iszero(n) { false }
    else if iszero(m) { true }
    else { lt(pi(m), pi(n)) }
}

fn cut_off_sub(m: i32, n: i32) -> i32 {
    if iszero(n) { m } else { cut_off_sub(pi(m), pi(n)) }
}

fn mod_func(m: i32, n: i32) -> i32 {
    if iszero(n) {
        -1
    } else if lt(m, n) {
        m
    } else {
        mod_func(cut_off_sub(m, n), n)
    }
}

fn main() {
    println!("Enter two numbers (m n): ");
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let nums: Vec<i32> = input.split_whitespace().map(|s| s.parse().unwrap()).collect();
    
    let result = mod_func(nums[0], nums[1]);
    if result == -1 {
        println!("Error: Cannot divide by zero.");
    } else {
        println!("The remainder of {} divided by {} is {}", nums[0], nums[1], result);
    }
}
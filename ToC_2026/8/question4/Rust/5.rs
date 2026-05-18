use std::io;

fn iszero(m: i32) -> bool { m == 0 }
fn pi(m: i32) -> i32 { if m == 0 { 0 } else { m - 1 } }

fn cut_off_sub(m: i32, n: i32) -> i32 {
    if iszero(n) {
        m
    } else {
        cut_off_sub(pi(m), pi(n))
    }
}

fn main() {
    println!("Enter two numbers (m n): ");
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let nums: Vec<i32> = input.split_whitespace().map(|s| s.parse().unwrap()).collect();
    
    let result = cut_off_sub(nums[0], nums[1]);
    println!("The cut-off subtraction of {} and {} is {}", nums[0], nums[1], result);
}
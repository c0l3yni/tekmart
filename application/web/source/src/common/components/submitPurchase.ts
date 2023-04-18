type Data = {
  message: string;
};

const submitPurchase = async (
  amount: number,
  source: string
): Promise<Data> => {
  const payload = {
    amount: amount,
    currency: "usd",
    source: source,
  };

  const response = await fetch("/api/stripe", {
    method: "POST",
    body: JSON.stringify({payload}),
    headers: {
      "Content-Type": "application/json",
    },
  });
  return await response.json();
};

export default submitPurchase;
